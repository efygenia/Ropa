class Ropa{

static main(){
document.querySelector("#consultarBtn").setAttribute("onclick", "Ropa.consultar();");
        }
static consultar(){
fetch("RopaServer",
        {method:"Get"})
        .then(
                function(response){
                return response.text();
                }
        ).then(
function (dato){
document.querySelector("#resultadoPnl").innerHTML = dato;
}

);
        }
}
Ropa.main();


