/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */

function validarForma(forma) {
    var usuario = forma.usuario;
    if (usuario.value == "" || usuario.value == "Escribir usuario") {
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }

    var password = forma.password;
    if (usuario.value == "" || password.value.length < 3) {
        alert("Debe proporcionar una contraseña de al menos 3 caracteres");
        usuario.focus();
        usuario.select();
        return false;
    }

    var tecnologias = forma.tecnologia;
    var checkSeleccionado = false;
    for (var i = 0; i < tecnologias.length; i++) {
        if (tecnologias[i].checked) {
            checkSeleccionado = true;
        }
    }
    
    if(!checkSeleccionado){
        alert("Debe seleccionar una tecnología");
        return false;
    }
    
    var generos = forma.genero;
    var radioSeleccionado = false;
    
    for (var i = 0; i < generos.length; i++) {
        if(generos[i].checked){
            radioSeleccionado = true;
        }
    }
    
    if(!radioSeleccionado){
        alert("Debe seleccionar un genero");
        return false;
    }
    
    var ocupacion = forma.ocupacion;
    if(ocupacion.value == ""){
        alert("Debe seleccionar una ocupacion");
        return false;
    }
    
    // Formulario valido
    alert("Formulario es valido");
    return true;
}
