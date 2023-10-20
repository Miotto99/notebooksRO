$("#login").click(enviarLogin);

$("#matricula").keyup(function(event){
    if (event.key === "Enter") {
        $("#senha").focus();
    }
});

$("#senha").keyup(function(event){
    if (event.key === "Enter") {
        enviarLogin();
    }
});

function enviarLogin(){
    let matricula = $("#matricula").val();
    let senha = $("#senha").val();

    $.ajax({
        type: "POST",
        url: "/login",
        data:{
            matricula: matricula,
            senha: senha
        },
        success: function(data){
            if(data){
                window.location.href="/Home";
            }else{
                alert("Errooouuu!");
            }
        },
        error: function(){
            alert("Falha ao tentar realizar o login!");
        }
    });
}