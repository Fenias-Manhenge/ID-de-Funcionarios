
package d290719;


public class Funcionario {
    public int codigo;
    public String nome;
    public char sexo;
    public double Salario[]=new double[12]; 

    public Funcionario(){
       codigo=0;
       nome="  ";
       sexo='*';
       for(int i=0;i<Salario.length;i++){
       Salario[i]=0.0;
       }
    }
    public double getSomaSalarios(){
        double S=0;
        for(int i=0;i<Salario.length;i++){
            S=S+Salario[i];
        }
        return S;
    }
    public double getMediaSalarios(){
        double S=0,M=0;
        int C=0;
        for(int i=0;i<Salario.length;i++){
         S=S+Salario[i];
         C=C+1;
        }
        if(C!=0){M=S/C;}
        return M;
    }
    public void imprimeFuncionario(){
        for(int i=0;i<Salario.length;i++){
            System.out.print(codigo+nome+sexo+Salario[i]);
        }
    }
    public void duplicaSalario(int m){
        for(int i=0;i<Salario.length;i++){
            m=(int) (m*Salario[i]);
            m=m*2;
            System.out.println(m);
        }
    }
}