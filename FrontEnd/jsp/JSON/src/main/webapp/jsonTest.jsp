<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-2.2.4.js">
</script>
<script>
	function dataLoad(){
		console.log("dataLoad....");
		$('#tbody').html('');
		var search='';
		$.ajax({
			url :'http://localhost:8787/gsonTest',
			type:"get",
			dataType:"json",
			success:function(d){
				console.log("data.length:"+d);
				// 전송 받은 코드를 출력하도록 재정의 하기!
				for(let i=0; i<d; i++){
					let block='<div>';
					block +='Hello';
					block +='</div>';
					search += block;
				}//for
			},
			error:function(error){
				console.log("error:");
			}
		});
		console.log(search);
		$('#tbody').append(search);	
	}
</script>
</head>
<body >
	<div ="#tbody">
	</div>
	<button onClick="dataLoad();">데이터 가져오기</button>

</body>
</html>