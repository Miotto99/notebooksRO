$("#enviar").click(cadastroSoftware);

    function cadastroSoftware(){
    let nome = $("#nome").val();
    let exigelicensa = $("#exigelicensa")[0].checked;

    $.ajax({
        type: "POST",
        url: "/cadastrosoftware",
        data:{
        nome:nome,
        exige_licensa:exigelicensa,
        },
        success: function(data){
            alert("isso ae");
        },
        error: function(){
            alert("deu ruim");
        }
    });
    }
