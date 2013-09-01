/**
 * Created with IntelliJ IDEA.
 * User: shanika
 * Date: 9/1/13
 * Time: 7:13 PM
 * To change this template use File | Settings | File Templates.
 */
var tblResultsTable = null;
jQuery(document).ready(function () {
    loadSubjects();
    $("#liSelectedSubject").append("Reading");

    loadSchoolDataBySubject(1);
    tblResultsTable = $("#resultsTable").dataTable({
        "aoColumns":[
            {"sClass":"tableCellHeader"},
            {"sClass":"tableCellHeader"},
            {"sClass":"tableCellHeader"},
            {"sClass":"tableCellHeader"},
            {"sClass":"tableCellHeader"},
            {"sClass":"tableCellHeader"},
            {"sClass":"tableCellHeader"},
            {"sClass":"tableCellHeader"},
            {"sClass":"tableCellHeader"}

        ]
    });
});


$('#searchStudent').keyup(function(e) {
    if(e.keyCode == 13) {
        var student = $.trim($('#searchStudent').val());
        loadSchoolDataByStudent(student);
    }
});

$('#subjects').change(function () {
    var subjectText = $.trim($('#subjects option:selected').text());
    var selectedSubject = $.trim($('#subjects option:selected').val());
    $("#liSelectedSubject").empty();
    $("#liSelectedSubject").append(subjectText);

    loadSchoolDataBySubject(selectedSubject);
});


function loadSchoolDataBySubject(selectedSubject) {
    var message = '';
    $.ajax({
        type:"POST",
        url:"/viewResults/loadSchoolResultsBySubject",
        async:true,
        data:{
            subjectId:selectedSubject
        },
        success:function (data, textStatus, xhr) {
            message = '';
            if (xhr.status == 200 && data != null) {
                var response = jQuery.parseJSON(data);
                tblResultsTable.fnClearTable(this);
                $.each(response.data, function (i, val) {
                    tblResultsTable.fnAddData([
                       this.SchoolName,
                        this.Y3,
                        this.Y5,
                        this.Y7,
                        this.Y9,
                        " ",
                        " ",
                        " ",
                        " "
                    ]);

                });

            }
        }, error:function (xhr) {
            message = '';
            switch (xhr.status) {
                case 500 :
                {
                    message = 'Server error occurred. Please try again later.';
                    break;
                }
                default :
                {
                    message = 'Error connecting to server. Please try again later. ';
                    break;
                }
            }

            showErrorHtmlMessage(message);
        }
    });


}


function loadSubjects() {
    var message = '';
    $.ajax({
        type:"POST",
        url:"/viewResults/loadSubjects",
        async:true,
        success:function (data, textStatus, xhr) {
            message = '';
            if (xhr.status == 200 && data != null) {
                var response = jQuery.parseJSON(data);

                $.each(response.data, function (i, val) {
                    $('#subjects').append("<option class='span6' value='" + val.value + "' >" + val.text + "</option>");
                });

            }
        }, error:function (xhr) {
            message = '';
            switch (xhr.status) {
                case 500 :
                {
                    message = 'Server error occurred. Please try again later.';
                    break;
                }
                default :
                {
                    message = 'Error connecting to server. Please try again later. ';
                    break;
                }
            }

            showErrorHtmlMessage(message);
        }
    });


}





function loadSchoolDataByStudent(studentName) {
    var message = '';
    $.ajax({
        type:"POST",
        url:"/viewResults/loadSchoolDataByStudent",
        async:true,
        data:{
            studentName:studentName
        },
        success:function (data, textStatus, xhr) {
            message = '';
            if (xhr.status == 200 && data != null) {
                var response = jQuery.parseJSON(data);
                tblResultsTable.fnClearTable(this);
                $.each(response.data, function (i, val) {
                    tblResultsTable.fnAddData([
                        this.SchoolName,
                        this.Y3,
                        this.Y5,
                        this.Y7,
                        this.Y9,
                        " ",
                        " ",
                        " ",
                        " "
                    ]);

                });

            }
        }, error:function (xhr) {
            message = '';
            switch (xhr.status) {
                case 500 :
                {
                    message = 'Server error occurred. Please try again later.';
                    break;
                }
                default :
                {
                    message = 'Error connecting to server. Please try again later. ';
                    break;
                }
            }

            showErrorHtmlMessage(message);
        }
    });


}




function showErrorHtmlMessage(message) {
    removeErrorBody();
    $("#error-body").append("<button data-dismiss='alert' onclick='removeErrorBody()' class='close'>x</button> " + message);
    $("#error-body").show();
}

function removeErrorBody() {
    $("#error-body").empty();
    $("#error-body").hide();
}

function showSuccessHtmlMessage(message) {
    removeSuccessBody();
    $("#success-body").append("<button data-dismiss='alert' onclick='removeSuccessBody()' class='close'>x</button> " + message);
    $("#success-body").show();
}

function removeSuccessBody() {
    $("#success-body").empty();
    $("#success-body").hide();
}