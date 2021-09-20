
package modelo;

import config.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;



public class AdminPreguntas {
       
      public ArrayList<Pregunta> preguntasPorDefecto;
 
      public static void AddPregunta(int nivel, Pregunta p){
          
          try(Connection con = new ConexionBD().GetConexion()) {
            
            Statement stmt = con.createStatement();
            String sqlCreateTable = "CREATE TABLE IF NOT EXISTS preguntas(" +
                                   "id BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY," +
                                   "nivel Integer NOT NULL,"+
                                   "enunciado VARCHAR(300)NOT NULL," +
                                   "opc1 VARCHAR(100) NOT NULL,"+
                                   "opc2 VARCHAR(100) NOT NULL,"+
                                   "opc3 VARCHAR(100) NOT NULL, "+
                                   "opc4 VARCHAR(100) NOT NULL,"+
                                   "respuesta Integer NOT NULL"+
                                   ")";
            String sqlInsert =  "INSERT INTO preguntas (nivel,enunciado,opc1,opc2,opc3,opc4,respuesta)"+
                                " VALUES ("+nivel+",'"+
                                p.getEnunciado()+"','"+
                                p.getOpciones().get(1)+"','"+
                                p.getOpciones().get(2)+"','"+
                                p.getOpciones().get(3)+"','"+
                                p.getOpciones().get(4)+"',"+
                                p.getRespuesta()+")";
                
            stmt.execute(sqlCreateTable);
            stmt.executeUpdate(sqlInsert);
    
            con.close();
       }catch(SQLException e){
           System.out.println(e.toString());
           System.out.println("Transaccion rechasada: " + e);
       }
    }
    
    public static void IniciarTablaPreguntas(){
        //preguntas iniciales nivel 1
        
        Pregunta p1= new Pregunta();
        p1.setEnunciado("¿En qué año se hundió el Titanic en el Océano Atlántico el 15 de abril, en su viaje inaugural desde Southampton?");
        HashMap <Integer,String> op1 = new HashMap<>();
        op1.put(1, "1900");
        op1.put(2, "1912");
        op1.put(3, "1911");
        op1.put(4, "1950");
        p1.setOpciones(op1);
        p1.setRespuesta(2);
        
        Pregunta p2= new Pregunta();
        p2.setEnunciado("¿Cual es la capital de Colombia?");
        HashMap <Integer,String> op2 = new HashMap<>();
        op2.put(1, "Barranquilla");
        op2.put(2, "Medellin");
        op2.put(3, "Bogota");
        op2.put(4, "Cartagena");
        p2.setOpciones(op2);
        p2.setRespuesta(3);
        
        Pregunta p3= new Pregunta();
        p3.setEnunciado("¿Cual es la raiz cuadrada de 16?");
        HashMap <Integer,String> op3 = new HashMap<>();
        op3.put(1, "4");
        op3.put(2, "2");
        op3.put(3, "1");
        op3.put(4, "16");
        p3.setOpciones(op3);
        p3.setRespuesta(1);
        
        Pregunta p4= new Pregunta();
        p4.setEnunciado("¿Cual es el nombre del personaje de caricaturas que es un pez payaso?");
        HashMap <Integer,String> op4 = new HashMap<>();
        op4.put(1, "Manchitas");
        op4.put(2, "Jorge");
        op4.put(3, "Calvin");
        op4.put(4, "Nemo");
        p4.setOpciones(op4);
        p4.setRespuesta(4);
        
        Pregunta p5= new Pregunta();
        p5.setEnunciado("¿De qué colores es la bandera de México?");
        HashMap <Integer,String> op5 = new HashMap<>();
        op5.put(1, "amarillo, rojo y negro");
        op5.put(2, "amarillo y azul");
        op5.put(3, "verde, rojo y blanco");
        op5.put(4, "rojo y verde");
        p5.setOpciones(op5);
        p5.setRespuesta(3);
        
        //preguntas iniciales nivel 2
        Pregunta p6= new Pregunta();
        p6.setEnunciado("¿Cuándo empezó la Primera Guerra Mundial?");
        HashMap <Integer,String> op6 = new HashMap<>();
        op6.put(1, "1920");
        op6.put(2, "1914");
        op6.put(3, "1905");
        op6.put(4, "1912");
        p6.setOpciones(op6);
        p6.setRespuesta(2);
        
        Pregunta p7= new Pregunta();
        p7.setEnunciado("¿Cuándo acabó la II Guerra Mundial?");
        HashMap <Integer,String> op7 = new HashMap<>();
        op7.put(1, "1935");
        op7.put(2, "1930");
        op7.put(3, "1950");
        op7.put(4, "1945");
        p7.setOpciones(op7);
        p7.setRespuesta(4);
        
        Pregunta p8= new Pregunta();
        p8.setEnunciado("¿Quién es el autor de el Quijote?");
        HashMap <Integer,String> op8 = new HashMap<>();
        op8.put(1, "Miguel de Cervantes");
        op8.put(2, "Paulo picasso");
        op8.put(3, "Gabriel Garcia");
        op8.put(4, "Jorge Isaac");
        p8.setOpciones(op8);
        p8.setRespuesta(1);
        
        Pregunta p9= new Pregunta();
        p9.setEnunciado("¿En qué país se encuentra la torre de Pisa?");
        HashMap <Integer,String> op9 = new HashMap<>();
        op9.put(1, "Rusia");
        op9.put(2, "Italia");
        op9.put(3, "Brasil");
        op9.put(4, "Alemania");
        p9.setOpciones(op9);
        p9.setRespuesta(2);
        
        //preguntas para la tercera ronda
        Pregunta p10= new Pregunta();
        p10.setEnunciado("¿Cómo se denomina el resultado de la multiplicación?");
        HashMap <Integer,String> op10 = new HashMap<>();
        op10.put(1, "Cociente");
        op10.put(2, "Residuo");
        op10.put(3, "Substracción");
        op10.put(4, "Producto");
        p10.setOpciones(op10);
        p10.setRespuesta(4);
        
        Pregunta p11= new Pregunta();
        p11.setEnunciado("¿Qué año llegó Cristóbal Colón a América?");
        HashMap <Integer,String> op11 = new HashMap<>();
        op11.put(1, "1485");
        op11.put(2, "1350");
        op11.put(3, "1492");
        op11.put(4, "1500");
        p11.setOpciones(op11);
        p11.setRespuesta(3);
        
        Pregunta p12= new Pregunta();
        p12.setEnunciado(" ¿Cuál es el disco más vendido de la historia?");
        HashMap <Integer,String> op12 = new HashMap<>();
        op12.put(1, "El centurión de la noche, El Joe");
        op12.put(2, "Triller, Michael Jackson");
        op12.put(3, "Back in Black- AC/DC.");
        op12.put(4, "La reina, Diomedes Díaz");
        p12.setOpciones(op12);
        p12.setRespuesta(2);
        
        
        Pregunta p13= new Pregunta();
        p13.setEnunciado("¿Cuál es tercer planeta en el sistema solar?");
        HashMap <Integer,String> op13 = new HashMap<>();
        op13.put(1, "La tierra");
        op13.put(2, "Plutón");
        op13.put(3, "Marte");
        op13.put(4, "Mercurio");
        p13.setOpciones(op13);
        p13.setRespuesta(1);
        
        Pregunta p14= new Pregunta();
        p14.setEnunciado("¿Qué país tiene forma de bota?");
        HashMap <Integer,String> op14 = new HashMap<>();
        op14.put(1, "China");
        op14.put(2, "Italia");
        op14.put(3, "España");
        op14.put(4, "Francia");
        p14.setOpciones(op14);
        p14.setRespuesta(2);
        
        Pregunta p15= new Pregunta();
        p15.setEnunciado("¿En qué lugar del cuerpo se produce la insulina?");
        HashMap <Integer,String> op15 = new HashMap<>();
        op15.put(1, "Pulmón");
        op15.put(2, "Higado");
        op15.put(3, "Pancreas");
        op15.put(4, "Estomago");
        p15.setOpciones(op15);
        p15.setRespuesta(3);
        
        //Preguntas de la ronda 4
        Pregunta p16= new Pregunta();
        p16.setEnunciado("¿Cómo se llama el animal más rápido del mundo?");
        HashMap <Integer,String> op16 = new HashMap<>();
        op16.put(1, "guepardo");
        op16.put(2, "león");
        op16.put(3, "zebra");
        op16.put(4, "chita");
        p16.setOpciones(op16);
        p16.setRespuesta(1);
        
        Pregunta p17= new Pregunta();
        p17.setEnunciado("¿En qué país se encuentra el famoso monumento Taj Mahal?");
        HashMap <Integer,String> op17 = new HashMap<>();
        op17.put(1, "Mongolia");
        op17.put(2, "Angola");
        op17.put(3, "India");
        op17.put(4, "Tailandia");
        p17.setOpciones(op17);
        p17.setRespuesta(3);
        
        Pregunta p18= new Pregunta();
        p18.setEnunciado(" ¿Cuál fue el primer metal que empleó el hombre?");
        HashMap <Integer,String> op18 = new HashMap<>();
        op18.put(1, "plata");
        op18.put(2, "oro");
        op18.put(3, "hierro");
        op18.put(4, "cobre");
        p18.setOpciones(op18);
        p18.setRespuesta(4);
        
        Pregunta p19= new Pregunta();
        p19.setEnunciado("¿En qué isla está situado el Teide?");
        HashMap <Integer,String> op19 = new HashMap<>();
        op19.put(1, "Cuba");
        op19.put(2, "Jamaica");
        op19.put(3, "Islas Margaritas");
        op19.put(4, "Islas Canarias");
        p19.setOpciones(op19);
        p19.setRespuesta(4);
        
        Pregunta p20= new Pregunta();
        p20.setEnunciado("¿Cómo se llama la estación espacial rusa?");
        HashMap <Integer,String> op20 = new HashMap<>();
        op20.put(1, "Nor");
        op20.put(2, "Mir");
        op20.put(3, "Mur");
        op20.put(4, "Nur");
        p20.setOpciones(op20);
        p20.setRespuesta(2);
        
       //preguntas para quinta ronda
        Pregunta p21= new Pregunta();
        p21.setEnunciado("¿Qué grasas hacen tan saludable el aceite de oliva?");
        HashMap <Integer,String> op21 = new HashMap<>();
        op21.put(1, "Las monoinsaturadas");
        op21.put(2, "Las monosaturadas");
        op21.put(3, "Las trans");
        op21.put(4, "Las Saturadas");
        p21.setOpciones(op21);
        p21.setRespuesta(1);
        
        Pregunta p22= new Pregunta();
        p22.setEnunciado(" ¿Quién escribió “Hamlet”?");
        HashMap <Integer,String> op22 = new HashMap<>();
        op22.put(1, "Ford Madox Ford");
        op22.put(2, "William Golding");
        op22.put(3, "William Shakespeare");
        op22.put(4, "Ruth Hogan");
        p22.setOpciones(op22);
        p22.setRespuesta(3);
        
        Pregunta p23= new Pregunta();
        p23.setEnunciado("¿Qué instrumento tocaba Paco de Lucía?");
        HashMap <Integer,String> op23 = new HashMap<>();
        op23.put(1, "Guitarra");
        op23.put(2, "Piano");
        op23.put(3, "Bateria");
        op23.put(4, "Bajo");
        p23.setOpciones(op23);
        p23.setRespuesta(1);
        
        Pregunta p24= new Pregunta();
        p24.setEnunciado("¿Qué día celebran los cristianos la festividad de la Epifanía de Jesús?");
        HashMap <Integer,String> op24 = new HashMap<>();
        op24.put(1, "10 diciembre");
        op24.put(2, "15 febrero");
        op24.put(3, "22 enero");
        op24.put(4, "6 enero");
        p24.setOpciones(op24);
        p24.setRespuesta(4);
        
        Pregunta p25= new Pregunta();
        p25.setEnunciado("¿Cuál es el metal más caro del mundo?");
        HashMap <Integer,String> op25 = new HashMap<>();
        op25.put(1, "titanio");
        op25.put(2, "rodio");
        op25.put(3, "oro");
        op25.put(4, "platino");
        p25.setOpciones(op25);
        p25.setRespuesta(2);
        
        ArrayList<Pregunta> n1 = new ArrayList<>();
        n1.add(p1);
        n1.add(p2);
        n1.add(p3);
        n1.add(p4);
        n1.add(p5);
        
        
        ArrayList<Pregunta> n2 = new ArrayList<>();
        n2.add(p6);
        n2.add(p7);
        n2.add(p8);
        n2.add(p9);
        n2.add(p10);
        
        ArrayList<Pregunta> n3 = new ArrayList<>();
        n3.add(p11);
        n3.add(p12);
        n3.add(p13);
        n3.add(p14);
        n3.add(p15);
        
        ArrayList<Pregunta> n4 = new ArrayList<>();
        n4.add(p16);
        n4.add(p17);
        n4.add(p18);
        n4.add(p19);
        n4.add(p20);
        
        ArrayList<Pregunta> n5 = new ArrayList<>();
        n5.add(p21);
        n5.add(p22);
        n5.add(p23);
        n5.add(p24);
        n5.add(p25);
        
        //nivel 1
        for(Pregunta p : n1){
            AddPregunta(1, p);
        }
        
        //nivel 2
        for(Pregunta p : n2){
            AddPregunta(2, p);
        }
        //nivel 3
        for(Pregunta p : n3){
            AddPregunta(3, p);
        }
        //nivel 4
        for(Pregunta p : n4){
            AddPregunta(4, p);
        }
        //nivel 5
        for(Pregunta p : n5){
            AddPregunta(5, p);
        }
    }
    
    public static int LongitudTablaPreguntas(){
          try {
              Connection con = new ConexionBD().GetConexion();
              Statement stmt = con.createStatement();
              String sql = "SELECT count(*) FROM preguntas";
              ResultSet resul = stmt.executeQuery(sql);
              int resp = 0;
              while(resul.next()){
                resp= resul.getInt("count(*)");   
                }
              con.close();
              return resp;
          } catch (SQLException ex) {
              Logger.getLogger(AdminPreguntas.class.getName()).log(Level.SEVERE, null, ex);
              return 0;
          }
        
    }
    public static Pregunta ExtraerPreguntaNivel (int nivel){
        try {
              Connection con = new ConexionBD().GetConexion();
              Statement stmt = con.createStatement();
              String sql = "SELECT * FROM  `preguntas`  WHERE nivel="+nivel+" ORDER BY rand() LIMIT 1";
              ResultSet resul = stmt.executeQuery(sql);
              Pregunta p = new Pregunta();
              HashMap<Integer, String> ops = new HashMap<>();
              while(resul.next()){
                  p.setEnunciado(resul.getString("enunciado"));
                  p.setRespuesta(resul.getInt("respuesta"));
                  ops.put(1, resul.getString("opc1"));
                  ops.put(2, resul.getString("opc2"));
                  ops.put(3, resul.getString("opc3"));
                  ops.put(4, resul.getString("opc4"));
                  p.setOpciones(ops);
                }
              con.close();
              return p;
          } catch (SQLException ex) {
              Logger.getLogger(AdminPreguntas.class.getName()).log(Level.SEVERE, null, ex);
              return null;
          }
    }
}
