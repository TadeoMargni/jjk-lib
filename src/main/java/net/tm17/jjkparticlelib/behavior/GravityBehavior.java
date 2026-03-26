package net.tm17.jjkparticlelib.behavior;

import net.tm17.jjkparticlelib.core.BaseParticle;

public class GravityBehavior implements ParticleBehavior{
    @Override
    public void tick(BaseParticle particle) {
        particle.setY(particle.getVy()-0.3);
    }
}
