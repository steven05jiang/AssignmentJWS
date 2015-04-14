<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="js/jquery-2.1.3.js"></script>
</head>
<body>
	<h1>Hello</h1>
	
<!-- 	Test For Create -->
	
<!--  		<script>
		$(function() {
			var site = {
				id : 3,
				name : "Site 3",
				latitude : 11.11,
				longitude : 22.22
			};

			$.ajax({
				url : "/AssignmentJWS/api/site",
				type : "post",
				dataType : "json",
				contentType : "application/json; charset=utf-8",
				data : JSON.stringify(site),
				success : function(response) {
					console.log("success!")
				}
			});
		});
	</script> -->
	
<!-- 	Test For Update -->
	
<!--  	<script>
		$(function() {
			var site = {
				id : 3,
				name : "Site 3",
				latitude : 0,
				longitude : 0
			};

			$.ajax({
				url : "/AssignmentJWS/api/site/3",
				type : "put",
				dataType : "json",
				contentType : "application/json; charset=utf-8",
				data : JSON.stringify(site),
				success : function(response) {
					console.log("success!")
				}
			});
		});
	</script>  -->
	
<!-- 	Test For Delete -->
	
<!--  	<script>
	 		$(function() {
			var id = "3";
			
			$.ajax({
				url: "/AssignmentJWS/api/site",
				type: "delete",
 				data: id,
				success: function(response){
					console.log("success!")
				}
			});
		});
		
	</script>  -->

</body>
</html>