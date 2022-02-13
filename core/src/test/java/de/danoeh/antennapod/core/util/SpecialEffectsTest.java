package de.danoeh.antennapod.core.util;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.example.specialeffects.DiscoveryDefaultUpdateParticle;

public class SpecialEffectsTest {
    @Test
    public void particle_isCreated() {
        DiscoveryDefaultUpdateParticle particleHandler = new DiscoveryDefaultUpdateParticle();
        assertEquals("particle01", particleHandler.createParticle());
    }
}