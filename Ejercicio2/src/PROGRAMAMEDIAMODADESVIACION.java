import javax.swing.JOptionPane; //Importamos el paquete necesario, para poder trabajar con ventanas emergentes.

/* Programa que permite la introducción de un número indeterminado de número separados por comas. 
La respuesta debe ser la media, desviación típica y moda de los datos */

public class PROGRAMAMEDIAMODADESVIACION {

	public static void main(String[] args) {
		

		

	
				//Declaramos las variables
				
				String Numeros;
				double Media;
				double DesviacionTipica;
				double Moda =0;
				
		       /*Solicitamos al usuario, a través de una ventana emergente,
				que introduzca Numeros enteros para realizar los posteriores calculos.*/
				
				Numeros=JOptionPane.showInputDialog("Buenos días, introduzca los numeros enteros a procesar, separados por una coma. ");
				
				//Creamos un array, para almacenar los numeros introducidos
				
				String[] NumeroString = Numeros.split(","); //creamos un array de texto utilizando la , como elemento separador. (aquí estarian los numeros puestos sin , (en modo texto).
				
				int [] NumerosArray = new int [NumeroString.length]; // creamos un array vacío para llenarlo con los datos del array NumeroString (de arriba) y con el Int del principio lo transformamos en Array tipo numero
				
				for (int i=0 ;i < NumeroString.length; i++) {
					NumerosArray [i] = Integer.parseInt(NumeroString [i]);  
				}
				
				//Calculamos la Media
				
			    int SumaTodosNumeros=0; //Declaramos esta variable para hacer posible el calculo de la Media.
			    
			    for (int i=0 ;i < NumerosArray.length; i++) {              /*Siempre 3 bloques separados por ";" primero indicamos q empezamos por la posición 0, 
			                                                                el segundo bloque nos indica la condición, es decir lo recorre entero y el i++ para que se vaya
			                                                                incrementando en 1 y no se haga infinito*/
			    SumaTodosNumeros = SumaTodosNumeros + NumerosArray [i];
			    
			    }
			    
			    Media = SumaTodosNumeros / NumerosArray.length ;
			    
				
				//Mostramos el resultado por ventana emergente.
				JOptionPane.showMessageDialog(null, "La media es: " +Media);
				
				
				//Calculamos la desviacioón típica.
				
			   double CalculamosDesviacion = 0; //Declaramos esta variable para hacer posible el cálculo de la desviación.
			   
			   for (int i=0 ; i <NumeroString.length; i++ ) {
				  
				   CalculamosDesviacion = CalculamosDesviacion + Math.pow(NumerosArray[i] - Media , 2 ); 
			   }
			   
				DesviacionTipica = Math.sqrt(CalculamosDesviacion/(NumerosArray.length-1));
				
				
				//Mostramos el resultado por ventana emergente.
				JOptionPane.showMessageDialog(null, "La desviación típiza es: " +DesviacionTipica);
				
				//Calculamos la Moda
				
				int MasRepetido = 0;  //contador 
				
				for (int i=0 ; i <NumerosArray.length; i++) {
					
					int RepeticionesActuales = 0;
					int Numeroactual = NumerosArray [i];
					
				for (int j=0 ; j <NumerosArray.length; j++) {
					
					if (Numeroactual == NumerosArray [j]) {
					 RepeticionesActuales = RepeticionesActuales + 1 ;
					}
					
				}
			        if (RepeticionesActuales > MasRepetido) {
			        	
			        	MasRepetido = RepeticionesActuales;
			            Moda = Numeroactual;
			        }
				
			       }
				
				//Mostramos el resultado por ventana emergente.
						JOptionPane.showMessageDialog(null, "La Moda es: " +Moda);

		}
			
		


	}


