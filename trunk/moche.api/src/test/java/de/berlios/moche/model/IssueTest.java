package de.berlios.moche.model;

import org.junit.Test;

/**
 * 
 * @author jjhop
 */
public class IssueTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetCurrentStatusWithNull() {
        Issue issue = new Issue();
        issue.setCurrentStatus(null);
    }

    @Test
    public void testChangeStatus() {
        // byc moze trzeba bedzie ten test przeniesc do klasy
        // obslugujacej zmiane stanu (wzorzec State)
    }
}
