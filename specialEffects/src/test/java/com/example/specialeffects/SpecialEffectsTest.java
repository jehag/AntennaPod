package com.example.specialeffects;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SpecialEffectsTest {
    @Test
    public void particle_isCreated() {
        DiscoveryDefaultUpdateParticle particleHandler = new DiscoveryDefaultUpdateParticle();
        assertEquals("particle01", particleHandler.createParticle());
    }
}