function buscar() {
    var nombre=$("#txtNombre").val();
    $.ajax({
        type: 'POST',
        url: 'buscador.do',
        data: {
            dato: nombre
        },
        success: function (result) {
            $("#resultado").html(result);
        }
    });

}