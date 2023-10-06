$("#enviar").click(cadastrarUsuario);

function cadastrarUsuario(){
    let nome = $("#nome").val();
    let matricula = $("#matricula").val();
    let email = $("#email").val();
    let cargo = $("#cargo")[0].value;

    $.ajax({
        type: "POST",
        url: "/cadastro",
        data:{
            nome:nome,
            email:email,
            matricula:matricula,
            cargo:cargo,
        },
        success:function(){
            alert("ok");
        },
        error: function(){
            alert("deu ruim lek");
        }
    });
}