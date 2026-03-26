package net.tm17.jjkparticlelib.core;

import net.tm17.jjkparticlelib.behavior.ParticleBehavior;

public class BaseParticle {
    private double x, y, z;
    private double vx, vy, vz;
    private float  size;
    int age=0;
    private float r, g, b;
    private ParticleBehavior behavior;


    public BaseParticle(double x,double y, double z, double vx, double vy, double vz, float size){
        this.x = x;
        this.y = y;
        this.z = z;
        this.vx = vx;
        this.vy = vy;
        this.vz = vz;
        this.r = 1f;
        this.g = 1f;
        this.b = 1f;

        this.size = size;
    }
    public void setBehavior(ParticleBehavior behavior) {
        this.behavior = behavior;
    }

    public void tick() {
        age++;
        if (behavior != null) {
            behavior.tick(this);
        }



    }

    public double getX() { return x; }
    public double getY() { return y; }
    public double getZ() { return z; }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setZ(double z) { this.z = z; }

    public double getVx() { return vx; }
    public double getVy() { return vy; }
    public double getVz() { return vz; }

    public void setVx(double vx) { this.vx = vx; }
    public void setVy(double vy) { this.vy = vy; }
    public void setVz(double vz) { this.vz = vz; }

    public float getSize() { return size; }
    public void setSize(float size) { this.size = size; }

    public int getAge() { return age; }
    public float getR() { return r; }
    public float getG() { return g; }
    public float getB() { return b; }

    public void setColor(float r, float g, float b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    
}
