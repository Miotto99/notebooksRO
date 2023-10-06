$("#enviar").click(cadastrarNotebooks);

function cadastrarNotebooks(){
    let numero = $("#numero").val();
    let patrimonio = $("#patrimonio").val();

    $.ajax({
        type: "POST",
        url: "/cadastroNote",
        data:{
            numero: numero,
            patrimonio: patrimonio
        },
        success: function(data){
            alert(data);
        },
        error: function(){
            alert("deu ruim");
        }
    });

}