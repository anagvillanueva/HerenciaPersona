
package persona;
public class Persona { // Esta es mi SuperClase o Clase Base llamada persona.

    private String nombre; 
    private int fechaDeNacimiento;     // Estos son sus atributos.
    private String curp;
    private String sexo;

    public Persona() {
    }

    public Persona(String nombre, int fechaDeNacimiento, String curp, String sexo) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.curp = curp;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(int fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
     
    public void platicar (){
        System.out.println("Platicando");  // Este es el metodo platicar.
    }
    
    public void pensar () {
        System.out.println("Pensando");  // Este es el metodo pensar.
    }
    
    public static void main(String[] args) {
        Persona Ana = new Persona (); // Estoy instanciando un objeto a partir de la clase persona.
        Ana.setNombre ("Ana Fernanda Gutierrez Villanueva ");
        Ana.setFechaDeNacimiento(27082001);                     
        Ana.setCurp(" GUVAMMTCLN8 ");
        Ana.setSexo("Femenino ");
      
        System.out.println("Nombre de la persona: " + Ana.nombre );
        System.out.println("Fecha de Nacimiento: " + Ana.fechaDeNacimiento);
        System.out.println("CURP: " + Ana.curp );
        System.out.println("Sexo: " + Ana.sexo );
        Ana.platicar();
        Ana.pensar ();
         
        Estudiante Alberto = new Estudiante();
        Alberto.setNumeroDeCuenta(420120487);
        Alberto.setCarrera("Ingenieria en Computacion");
        Alberto.setPromedio((float) 9.8);
        
        System.out.println("Numero de cuenta del estudiante: " + Alberto.numeroDeCuenta);
        System.out.println("Carrera: " + Alberto.carrera);
        System.out.println("Promedio: " + Alberto.promedio);
        Alberto.Estudiar();
        Alberto.pensar();
        
        Trabajador Jorge = new Trabajador ();
        Jorge.setSalario(3500);
        Jorge.setRfc("S233847SHF");
        Jorge.setPuesto("FullStack Developer");
        Jorge.setAnioDeIngreso(2007);
        
        System.out.println("Salario del trabajador: " + Jorge.salario);
        System.out.println("RFC: " + Jorge.rfc);
        System.out.println("Puesto: " + Jorge.puesto);
        System.out.println ("Año de ingreso: " + Jorge.anioDeIngreso);
        Jorge.platicar();
        Jorge.trabajar();
    }
}
