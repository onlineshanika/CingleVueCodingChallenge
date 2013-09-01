<%@ include file="common/header.jsp" %>
<%@ include file="common/includeScripts.jsp" %>

<div class="container">
    <div class="row-fluid">
        <div class="span9">
            <div id="error-body" class="alert alert-error" style="display: none"></div>
            <div id="success-body" class="alert alert-success" style="display: none"></div>
            <table class="table table-striped datatable" id="resultsTable">
                <thead>
                <tr>
                    <th class="tableCellHeader">School</th>
                    <th class="tableCellHeader">Y3</th>
                    <th class="tableCellHeader">Y5</th>
                    <th class="tableCellHeader">Y7</th>
                    <th class="tableCellHeader">Y9</th>
                    <th class="tableCellHeader">Raw Gain Y3 to Y5</th>
                    <th class="tableCellHeader">Factored Gain Y3 to Y5</th>
                    <th class="tableCellHeader">CLG% Y3 to Y5</th>
                    <th class="tableCellHeader">Gain in Gain Y3 to Y5</th>

                </tr>
                </thead>
                <tbody>
                </tbody>
            </table>

        </div>
        <div class="span3">
            <div>

                <label>Search Student</label>
                <input class="span10" type="text" id="searchStudent" placeholder="Search">


                <label>Subject</label>
                <select id="subjects" class="span9">
                </select>


            </div>
        </div>
    </div>
</div>

<%@ include file="common/footer.jsp" %>

<%--javascript--%>
<script type='text/javascript' src='<c:url value="/resources/js/pages/subject.results.js"/>'></script>