package net.tm17.jjkparticlelib.behavior;

import net.tm17.jjkparticlelib.core.BaseParticle;

public class AttractionBehavior implements ParticleBehavior{
    double cx, cy, cz;
    double fuerza;
    double dx, dy, dz;
    public AttractionBehavior(double cx, double cy, double cz,double fuerza ){
        this.cx = cx;
        this.cy = cy;
        this.cz = cz;
        this.fuerza = fuerza;
    }

    @Override
    public void tick(BaseParticle particle) {
        dx=particle.getX()-cx;
        dy=particle.getY()-cy;
        dz=particle.getZ()-cz;

        particle.setVx(particle.getVx() + dx * fuerza);
        particle.setVy(particle.getVy() + dy * fuerza);
        particle.setVz(particle.getVz() + dz * fuerza);
    }
}
