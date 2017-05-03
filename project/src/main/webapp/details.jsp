<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>销售情况详述</title>

<link rel="stylesheet"
	href="/project/res/js/bootstrap-3.3.7/dist/css/bootstrap.min.css" />
<script src="/project/res/js/jquery-3.2.0.min.js"></script>
<script src="/project/res/js/bootstrap-3.3.7/dist/js/bootstrap.min.js"></script>
<style type="text/css">
	div div{
		margin-bottom: 5px;
	}
</style>
</head>
<body style="background:url(这里是背景图地址) #FFD">
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">销售编号</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" value="${orderInfoDetails.id }" />
		</div>
	</div>
	
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">销售时间</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" value="${orderInfoDetails.o_date}" />
		</div>
	</div>
	
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">产品名称</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" value="${orderInfoDetails.c_name }" />
		</div>
	</div>
	
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">产品编号</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" value="${orderInfoDetails.c_id}">
		</div>
	</div>
	
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">产品生产时间</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" value="${orderInfoDetails.c_production_time }">
		</div>
	</div>
	
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">产品类型</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" value="${orderInfoDetails.c_type_name }">
		</div>
	</div>
	
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">卖出数</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" value="1">
		</div>
	</div>
	
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">价格</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" value="${orderInfoDetails.o_price }">
		</div>
	</div>
	
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">备注</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" value="${orderInfoDetails.c_remarks }">
		</div>
	</div>
	
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">购买人名称</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" value="${orderInfoDetails.c_name_of_purchaser }">
		</div>
		
	</div>
</body>
</html>