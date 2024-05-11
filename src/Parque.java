import java.util.HashSet;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import javaapplication22.Visitante;
import javaapplication22.atracciones;

public class Parque {
    
    private Queue<Visitante> visitantes = new ArrayBlockingQueue<>(99);
    private Set<Integer> idsUtilizados = new HashSet<>();
    private String nombreDelParque;
    private Queue<atracciones> juegos;
    
    

    public void registroDeEntrada(String nombre, int edad, int id) {
        if (idsUtilizados.contains(id)) {
            System.out.println("El ID ya está en uso.");
        } else {
            Visitante visita = new Visitante(nombre, edad, id);
            visitantes.add(visita);
            idsUtilizados.add(id);
            System.out.println("Visitante agregado correctamente.");
        }
    }

    public int controlCapacidad() {
        return visitantes.size();
    }

    public boolean salidaDelParque(int id) {
        Iterator<Visitante> iterator = visitantes.iterator();
        while (iterator.hasNext()) {
            Visitante visitante = iterator.next();
            if (visitante.getId() == id) {
                iterator.remove();
                idsUtilizados.remove(id);
                System.out.println("Visitante con ID " + id + " eliminado.");
                return true;
            }
        }
        System.out.println("No se encontró ningún visitante con el ID " + id);
        return false;
    }

    public void consultarFila() {
        int contadorNinos = 0;
        for (Visitante v : visitantes) {
            if (v.getEdad() < 13) {
                contadorNinos++;
            }
        }
        System.out.println("En la fila hay " + contadorNinos + " niños.");
    }

    public Visitante buscarNino(int id) { //Probado por arian :)
        for (Visitante v : visitantes) {
            if (v.getEdad() < 13 && v.getId() == id) {
                System.out.println("Niño encontrado.");
                return v;
            }
        }
        System.out.println("Niño no encontrado.");
        return null;
    }
}
