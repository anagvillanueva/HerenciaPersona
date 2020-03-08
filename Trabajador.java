
package persona;
public class Trabajador extends Persona  { // De nuevo estoy creando una subclase pero ahora llamada Trabajador.
            
            int salario;
            String rfc; 
            String puesto;    // Atributos 
            int anioDeIngreso; 
            
            //METODOS 
            @Override // Metodo heredado pero modificado de la SuperClase 
            public void platicar (){
                System.out.println("Platicando sobre proyecto de trabajo ");
            }
            // CTRL + ESPACIO
            public void trabajar () {
                System.out.println("Trabajando");
            }
            
            public void ganarDinero () {
            }
            
            public void levantarseTemprano (){
            }

            public Trabajador() {
            }

            public Trabajador(int salario, String rfc, String puesto, int añoDeIngreso) {
                this.salario = salario;
                this.rfc = rfc;
                this.puesto = puesto;
                this.anioDeIngreso = anioDeIngreso;
            }

            public Trabajador(int salario, String rfc, String puesto, int añoDeIngreso, String nombre, int fechaDeNacimiento, String curp, String sexo) {
                super(nombre, fechaDeNacimiento, curp, sexo);
                this.salario = salario;
                this.rfc = rfc;
                this.puesto = puesto;
                this.anioDeIngreso = anioDeIngreso;
            }
            
            // ALT + INS 
            public int getSalario() {
                return salario;
            }

            public void setSalario(int salario) {
                this.salario = salario;
            }

            public String getRfc() {
                return rfc;
            }

            public void setRfc(String rfc) {
                this.rfc = rfc;
            }

            public String getPuesto() {
                return puesto;
            }

            public void setPuesto(String puesto) {
                this.puesto = puesto;
            }

            public int getAnioDeIngreso() {
                return anioDeIngreso;
            }

            public void setAnioDeIngreso(int añoDeIngreso) {
                this.anioDeIngreso = añoDeIngreso;
            }
            
        }
