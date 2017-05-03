<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="/project/res/js/bootstrap-3.3.7/dist/css/bootstrap.min.css" />
<script src="/project/res/js/jquery-3.2.0.min.js"></script>
<script src="/project/res/js/bootstrap-3.3.7/dist/js/bootstrap.min.js"></script>


<script type="text/javascript">
	$(function() {
		$(document).on('click', 'table tr td button', function() {
			window.location.href = '/project/details?id=' + $(this).parent().parent().find(':eq(0)').find('input').val();
		});
		load(1,5);
	});
	var pageNo = 1;
	var whereName = '';
	var whereValue = '';
	function load(page,pageSize) {
		$.post('/project/rest/users/getOrderinfo',{page:page,rows:pageSize,whereName:whereName,whereValue:whereValue},function(data){
			var total = data.total;
			var rows = data.rows;
			var pageCount = 0;
			if (total%pageSize > 0) {
				pageCount = ((total/pageSize)+1).toFixed(0);
			}else{
				pageCount = total/pageSize;
			}
			var str = "";
			for (var i = 0; i < rows.length; i++) {
				str += '<tr>';
				str += '<td style="display: none;"><input type="hidden" value="' + rows[i].id + '"></td>';
				str += '<td>' + rows[i].id + '</td>';
				str += '<td>' + rows[i].c_id + '</td>';
				str += '<td>' + rows[i].c_name + '</td>';
				str += '<td>' + rows[i].o_date + '</td>';
				str += '<td>' + 1 + '</td>';
				str += '<td>' + rows[i].o_price + '</td>';
				str += '<td>' + rows[i].c_name_of_purchaser + '</td>';
				str += '<td>';
				str += '<button type="button" class="btn btn-info" data-toggle="button">查看详情</button>';
				str += '</td>';
				str += '</tr>';
			}
			$('tbody').html(str);
		},'json');
	}
	
	function up(){
		pageNo--;
		if(pageNo <= 0){
			pageNo = 0;
		}
		load(pageNo,5,'','');
	}
	
	function next(){
		pageNo++;
		load(pageNo,5,'','');
	}

	function serach(){
		whereName = $('#whereName').val();
		whereValue =  $('#whereValue').val();
		pageNo = 1;
		load(pageNo, 5, whereName, whereValue);
	}
</script>
<title>主页</title>
</head>
<body  style="background:url(这里是背景图地址) #FFD">
	<div ng-app="myApp" ng-controller="customersCtrl">
	
		<table id="table" class="table table-hover">
			<caption><h4>销售概述</h4></caption>
			<caption>
				搜索:
				<select id="whereName">
					<option value="">全部</option>
					<option value="o_date">卖出时间</option>
					<option value="c_name">销售物品</option>
					<option value="o_price">价格区间</option>
				</select>
				<input type="text" id="whereValue"/>
				<button type="button" class="btn btn-info" data-toggle="button" onclick="serach();">搜索</button>
			</caption>
			<thead>
				<tr>
				    <th>销售编号</th>
					<th>产品编号</th>
					<th>产品名称</th>
					<th>卖出时间</th>
					<th>卖出数量</th>
					<th>价格</th>
					<th>购买人名称</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td>
						<button type="button" class="btn btn-info" data-toggle="button">查看详情</button>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
	<div>
		<ul class="pagination">
		    <li><a href="javascript:up();">上一页</a></li>
		    <li><a href="javascript:next();">下一页</a></li>
			</ul>
		</div>
</body>
</html>