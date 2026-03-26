package net.tm17.jjkparticlelib.behavior;

import net.tm17.jjkparticlelib.core.BaseParticle;

public class DragBehavior implements ParticleBehavior {

    private final double drag;

    public DragBehavior(double drag) {
        this.drag = drag;
    }

    @Override
    public void tick(BaseParticle particle) {

        particle.setVx(particle.getVx() * drag);
        particle.setVy(particle.getVy() * drag);
        particle.setVz(particle.getVz() * drag);
    }
}