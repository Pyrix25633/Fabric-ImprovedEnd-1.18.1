package net.rupyber_studios.improved_end.world.gen;

public class ModWorldGen {
    public static void generateModWorldGen() {
        ModOreGeneration.generateOres();

        ModFlowerGeneration.generateFlowers();

        ModTreeGeneration.generateTrees();

        ModEntitySpawn.addEntitySpawn();
    }
}