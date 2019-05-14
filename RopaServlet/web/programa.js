class Ropa{
    
    static main(){
        document.querySelector("#consultarBtn").setAttribute("onclick","Ropa.consultar();");
    }
    static consultar(){
        fetch("RopaServer",
        {method:"Get"});                                
    }
}
Ropa.main();


