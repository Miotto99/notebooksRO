$("#enviar").click(enviarCadastroSoftware);

    function enviarCadastroSoftware(){
    let nome = $("#nome").val();
    let exigelicensa = $("#exigelicensa")[0].checked;

    $.ajax({
        type: "POST",
        url: "/cadastro/software",
        data:{
        nome:nome,
        exige_licensa:exigelicensa,
        },
        success: function(data){
            alert("isso ae");
        },
        error: function(){
            alert("!isso ae");
        }
    });
    }
