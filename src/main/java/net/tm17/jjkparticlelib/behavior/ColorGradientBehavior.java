package net.tm17.jjkparticlelib.behavior;

import net.tm17.jjkparticlelib.core.BaseParticle;

public class ColorGradientBehavior implements ParticleBehavior{
    private int age=0;
    private final int r, g, b;
    private final int maxAge;

    private final int fr , fg, fb;

    public ColorGradientBehavior(int ir, int ig, int ib, int fr, int fb, int fg, int maxAge){
        this.r = ir;
        this.g = ig;
        this.b = ib;
        this.fr = fr;
        this.fg = fg;
        this.fb = fb;
        this.maxAge = maxAge;
    }

    @Override
    public void tick(BaseParticle particle) {


        double t = (double) particle.getAge() / maxAge;
        if (t > 1) {
            t = 1;
        }
        float nr = (float) (r + (fr - r) * t);
        float ng = (float) (g + (fg - g) * t);
        float nb = (float) (b + (fb - b) * t);


        particle.setColor(nr, ng, nb);
    }
}

