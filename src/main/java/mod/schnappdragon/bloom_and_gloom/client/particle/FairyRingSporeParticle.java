package mod.schnappdragon.bloom_and_gloom.client.particle;

import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particles.BasicParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class FairyRingSporeParticle extends SpriteTexturedParticle {
    private final IAnimatedSprite spriteSetWithAge;

    private FairyRingSporeParticle(ClientWorld world, double x, double y, double z, double motionX, double motionY, double motionZ, IAnimatedSprite spriteSetWithAge) {
        super(world, x, y, z);
        this.spriteSetWithAge = spriteSetWithAge;
        this.maxAge = (int) (4 + rand.nextDouble() * 4);
        this.particleGravity = 0.01F;
        float f = this.rand.nextFloat() * 0.6F + 0.4F;
        this.particleRed = f;
        this.particleGreen = f;
        this.particleBlue = f;
        this.motionX = motionX;
        this.motionY = motionY;
        this.motionZ = motionZ;
        this.selectSpriteWithAge(spriteSetWithAge);
    }

    public void tick() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        if (this.age++ >= this.maxAge) {
            this.setExpired();
        } else {
            this.motionY -= this.particleGravity;
            this.move(this.motionX, this.motionY, this.motionZ);
            this.selectSpriteWithAge(this.spriteSetWithAge);
        }
    }

    public IParticleRenderType getRenderType() {
        return IParticleRenderType.PARTICLE_SHEET_LIT;
    }

    @OnlyIn(Dist.CLIENT)
    public static class Factory implements IParticleFactory<BasicParticleType> {
        private final IAnimatedSprite spriteSet;

        public Factory(IAnimatedSprite spriteSet) {
            this.spriteSet = spriteSet;
        }

        public Particle makeParticle(BasicParticleType typeIn, ClientWorld worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            return new FairyRingSporeParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
        }
    }
}