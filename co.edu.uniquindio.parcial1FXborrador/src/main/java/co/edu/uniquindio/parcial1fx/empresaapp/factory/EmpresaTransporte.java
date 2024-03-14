package co.edu.uniquindio.parcial1fx.empresaapp.factory;

public class EmpresaTransporte {

    private static  EmpresaTransporte empresaTransporte;

    private EmpresaTransporte() {
    }

    public  static EmpresaTransporte getInstance(){
        if(empresaTransporte == null){
            empresaTransporte = new EmpresaTransporte();
        }
        return empresaTransporte;
    }

}
