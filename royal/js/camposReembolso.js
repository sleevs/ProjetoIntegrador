function phone(z){
    v = z.value;
    v=v.replace(/\D/g,"") //permite digitar apenas números
    v=v.replace(/(\d{0})(\d{1,11})$/,"$1($2")
    v=v.replace(/(\d{2})(\d{2,9})$/,"$1)$2") 
    v=v.replace(/(\d{1})(\d{3,4})$/,"$1-$2") 
    z.value = v;
    }

function validacaoEmail(field) {
    var usuario = field.value.substring(0, field.value.indexOf("@"));
    var dominio = field.value.substring(field.value.indexOf("@")+ 1, field.value.length);
        
        if ((usuario.length >=1) &&
            (dominio.length >=3) && 
            (usuario.search("@")==-1) && 
            (dominio.search("@")==-1) &&
            (usuario.search(" ")==-1) && 
            (dominio.search(" ")==-1) &&
            (dominio.search(".")!=-1) &&      
            (dominio.indexOf(".") >=1)&& 
            (dominio.lastIndexOf(".") < dominio.length - 1)) {
            title ="E-mail valido";
        }
        else{
        title ="E-mail invalido";
        }
}