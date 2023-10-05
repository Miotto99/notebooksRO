$('a').click(function(event){
    event.preventDefault();
    controleRotasGet($(this).attr("href"));
});

function controleRotasGet(url){
    switch(url){
        case "/logout":
            gerarSwal(url);
            break;
        case "/cadastroNote":
            $.get(url,function(data){
                $(".container").html(data);

                $("#enviar").click(enviaCadastroNotebooks);
            })
            break;
        default:
            alert('cancelei o get e fiz nada mb');
    }
}

function gerarSwal(urlSucesso){
    const swalWithBootstrapButtons = Swal.mixin({
      customClass: {
        confirmButton: 'btn btn-success me-2',
        cancelButton: 'btn btn-danger ms-2'
      },
      buttonsStyling: false
    })

    swalWithBootstrapButtons.fire({
      title: 'Sair?',
      text: "Você realmente deseja sair da aplicação?",
      icon: 'question',
      showCancelButton: true,
      confirmButtonText: '<i class="fa-solid fa-thumbs-up"></i> Sim!',
      cancelButtonText: '<i class="fa-solid fa-thumbs-down"></i> Não!',
      reverseButtons: false
    }).then((result) => {
        if (result.isConfirmed) {
            window.location.href=urlSucesso;
        }
    });
}