$("#cadastroNote").click(cadastrarNote);
$("#sair").click(sair);

    function sair(){
        window.location.href="Home/home";
    }

    function cadastrarNote(){
        let numeroNote = $("#numero").val();
        let patrimonio = $("#patrimonio").val();

        $.ajax({
            type: "POST",
            url: "/cadastroNote",
            data:{
                numero:numeroNote,
                patrimonio:patrimonio,
            },
            success:function(data){
                alert("ok");
            },
            error: function(){
                alert("deu ruim lek, complicado");
            }
        });
    }