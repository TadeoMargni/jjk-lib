package net.tm17.jjkparticlelib.behavior;

import net.tm17.jjkparticlelib.core.BaseParticle;

public class ScaleBehavior implements ParticleBehavior {

    private final double scaleFactor;

    public ScaleBehavior(double scaleFactor) {
        this.scaleFactor = scaleFactor;
    }

    @Override
    public void tick(BaseParticle particle) {

        float newSize = (float) (particle.getSize() * scaleFactor);
        particle.setSize(newSize);
    }
}