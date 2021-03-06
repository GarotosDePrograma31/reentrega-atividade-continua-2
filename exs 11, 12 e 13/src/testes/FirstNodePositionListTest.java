package testes;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import source.NodePositionList;
import source.Position;

public class FirstNodePositionListTest {

	@Test
	public void test() {
		NodePositionList<Integer> l = new NodePositionList<Integer>();
		assertEquals("[]", l.toString(), "[]");
	
		l.addFirst(1);
		l.addFirst(2);
		l.addFirst(3);
		l.addFirst(4);
		l.addFirst(5);
		l.addFirst(6);
		Position<Integer> p1 =  null;
	
		assertEquals("[6, 5, 4, 3, 2, 1]", l.toString(), "[6, 5, 4, 3, 2, 1]");
		
		p1 = l.last();
		l.makeFirst(p1);
		assertEquals("[1, 6, 5, 4, 3, 2]", l.toString(), "[1, 6, 5, 4, 3, 2]");
		
		p1 = l.last();
		l.makeFirst(p1);
		assertEquals("[2, 1, 6, 5, 4, 3]", l.toString(), "[2, 1, 6, 5, 4, 3]");
				
		
		
	}

}