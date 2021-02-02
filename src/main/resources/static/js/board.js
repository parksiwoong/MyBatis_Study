
/*$(function(){*/
    $("#btn-save").on("click", function(){
        save();
    });
/*});*/

function  save(){
    let data = {
        title : $("#title").val(),
        writer: $("#writer").val(),
        content:$("#content").val()
    };


    $.ajax({
            type:"POST"
            ,url:"/postwrite"
            ,data:JSON.stringify(data)
            ,contentType:"application/json; charset=utf-8"
            ,dataType:"json"
        }).done(function (resp){
            console.log(resp);
            if (resp > 0){
                alert("Write Ok");
                location.href="board/boardlist";
            }else{
                alert("Write Failed");
            }
    }).fail(function (error){
        alert(JSON.stringify(error));
    });
}