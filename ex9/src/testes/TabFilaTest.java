package testes;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import source.FilaNode;
import source.Queue;
public class TabFilaTest {
	
	static final Queue<Integer> a = new FilaNode<Integer>();

	@Test
	public void test() {
		
		assertEquals("[]", a.toString(), "Fila vazia");
			
		a.enqueue(5);
		a.enqueue(3);
		
		assertEquals(5, a.dequeue()," verfica se 5 sai primeiro ");
		
		a.enqueue(2);
		a.enqueue(8);
		
		assertEquals(3, a.dequeue()," verifica se 3 sai primeiro");
		
		assertEquals(2, a.dequeue()," verifica se 2 sai primeiro");
		
		a.enqueue(9);
		a.enqueue(1);
		
		assertEquals(8, a.dequeue()," verifica se 8 sai primeiro");
		
		a.enqueue(7);
		a.enqueue(6);
		
		assertEquals(9, a.dequeue()," verifica se 9 sai primeiro");
		
		assertEquals(1, a.dequeue()," verifica se 1 sai primeiro");
		
		a.enqueue(4);
		
		assertEquals(7, a.dequeue()," verifica se 7 sai primeiro");

		assertEquals(6, a.dequeue()," verifica se 6 sai primeiro");

		assertEquals("[4]", a.toString(), " vericia se o sobrou somento o ultimo elemento da lista");
		
	}

}