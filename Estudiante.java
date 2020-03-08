
package persona;
public class Estudiante extends Persona{  // Aqui estoy generando una subclase con -extends- que se llamara Estudiante.
        
       int numeroDeCuenta; 
       String carrera;       // Atributos de la subclase Estudiante 
       float promedio;
       
       // METODOS de la subclase
       
       public void Estudiar (){
           System.out.println("Estudiando");
       }
    
        @Override // Estamos "heredando" un metodo de la SuperClase utilizando Override, solo que va tener un comportamiento distinto.
        public void pensar () {
            System.out.println("Pensando en aprobar POO");
        }
        
        public void dormirEnClase (){  
        }
        
        public void HacerTarea (){
       }

        public Estudiante() {
        }
       
        // CTRL + Espacio 
        public Estudiante(int numeroDeCuenta, String carrera, float promedio) {
            this.numeroDeCuenta = numeroDeCuenta;
            this.carrera = carrera;
            this.promedio = promedio;
        }

        public Estudiante(int numeroDeCuenta, String carrera, float promedio, String nombre, int fechaDeNacimiento, String curp, String sexo) {
            super(nombre, fechaDeNacimiento, curp, sexo);
            this.numeroDeCuenta = numeroDeCuenta;
            this.carrera = carrera;
            this.promedio = promedio;
        }
        // ALT + INS
        public int getNumeroDeCuenta() {
            return numeroDeCuenta;
        }

        public void setNumeroDeCuenta(int numeroDeCuenta) {
            this.numeroDeCuenta = numeroDeCuenta;
        }

        public String getCarrera() {
            return carrera;
        }

        public void setCarrera(String carrera) {
            this.carrera = carrera;
        }

        public float getPromedio() {
            return promedio;
        }

        public void setPromedio(float promedio) {
            this.promedio = promedio;
        }
}