$("#enviar").click(locacaoNotebooks);

    function locacaoNotebooks(){
    let nome = $("#nome").val();
    let exigelicensa = $("#exigelicensa")[0].checked;

    $.ajax({
        type: "POST",
        url: "/locacaoNote",
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