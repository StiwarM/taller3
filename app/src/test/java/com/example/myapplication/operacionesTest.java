package com.example.myapplication;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

public class operacionesTest extends TestCase {
    private operaciones mOperacion;

    @Before
    public void setUp(){
        mOperacion = new operaciones();
    }

    @Test
    public void operacionNotNull(){
        assertNotNull(mOperacion);
    }

    @Test

    public void testNota() throws Exception {
        assertEquals("200",mOperacion.nota("50","50","50","50"));
    }
}