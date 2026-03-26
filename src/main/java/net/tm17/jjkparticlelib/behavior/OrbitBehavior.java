package net.tm17.jjkparticlelib.behavior;

import net.tm17.jjkparticlelib.core.BaseParticle;

import java.util.Vector;

public class OrbitBehavior implements ParticleBehavior{
    double cx, cy, cz;

    double radius;
    double angle;
    double omega;
    double ax;
    double ay;
    private final double az;
    double zy;

    public OrbitBehavior(double cx, double cy, double cz,
                         double radius,
                         double angle,
                         double omega,
                         double ax, double ay,
                         double az) {
        this.cx = cx;
        this.cy = cy;
        this.cz = cz;
        this.radius = radius;
        this.angle = angle;
        this.omega = omega;

        this.ax = ax;
        this.ay = ay;
        this.az = az;
    }


    @Override
    public void tick(BaseParticle particle) {
        angle += omega;

        double axisLength = Math.sqrt(ax * ax + ay * ay + az * az);
        if (axisLength <= 0) return; //no tiene direccion


        double nx = ax / axisLength;
        double ny = ay / axisLength;
        double nz = az / axisLength;

        double px;
        double py;
        double pz;

        if (Math.abs(ny) < 0.99) {
            px = 0;
            py = 1;
            pz = 0;
        } else {
            px = 1;
            py = 0;
            pz = 0;
        }

        double ux = ny * pz - nz * py;
        double uy = nz * px - nx * pz;
        double uz = nx * py - ny * px;

        double uLength = Math.sqrt(ux * ux + uy * uy + uz * uz);
        if (uLength <= 0) return;
        ux = ux / uLength;
        uy = uy / uLength;
        uz = uz / uLength;

        double vx = ny * uz - nz * uy;
        double vy = nz * ux - nx * uz;
        double vz = nx * uy - ny * ux;

        double cos = Math.cos(angle);
        double sin = Math.sin(angle);

        double offsetX = ux * (cos * radius) + vx * (sin * radius);
        double offsetY = uy * (cos * radius) + vy * (sin * radius);
        double offsetZ = uz * (cos * radius) + vz * (sin * radius);


        particle.setX(cx + offsetX);
        particle.setY(cy + offsetY);
        particle.setZ(cz + offsetZ);


    }

}
