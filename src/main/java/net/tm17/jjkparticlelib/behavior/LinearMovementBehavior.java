package net.tm17.jjkparticlelib.behavior;

import net.tm17.jjkparticlelib.core.BaseParticle;

import java.util.Set;

public class LinearMovementBehavior implements ParticleBehavior {

    @Override
    public void tick(BaseParticle particle) {
        particle.setX(particle.getX()+particle.getVx());
        particle.setY(particle.getY()+particle.getVy());
        particle.setZ(particle.getZ()+particle.getVz());
    }
}

