<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>
    <meta charset="utf-8">
    <title>CingleVue Coding Challenge</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/bootstrapApp.css"/>' />
    <link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/datatable-bootstrap.css"/>' />
    <link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/font-awesome/css/font-awesome.css"/>' />
</head>

<!--=== Breadcrumbs ===-->
<div class="row-fluid breadcrumbs margin-bottom-20">
    <div class="container">
        <ul class="pull-left breadcrumb">
            <li><a href="/index">Pines School District </a> <span class="divider">/</span></li>
            <li class="active" id="liSelectedSubject"></li>
        </ul>
    </div><!--/container-->
</div><!--/breadcrumbs-->
<!--=== End Breadcrumbs ===-->