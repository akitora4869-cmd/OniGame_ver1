package jp.muimi.onigame;
public enum PlayerSkill {
    SPRINT("疾走", 35), INVISIBLE("隠形", 40), SMOKE("煙幕", 35), ONI_STRIKE("破鬼撃", 45), HEAL("治療", 45), OBSESSION("執念", 35), SAFE_LANDING("安定着地", 20);
    public final String display; public final int cooldown;
    PlayerSkill(String display, int cooldown) { this.display=display; this.cooldown=cooldown; }
    public static PlayerSkill parse(String s) {
        if (s == null) return null;
        return switch(s.toLowerCase()) { case "sprint", "疾走" -> SPRINT; case "invisible", "隠形" -> INVISIBLE; case "smoke", "煙幕" -> SMOKE; case "strike", "破鬼撃" -> ONI_STRIKE; case "heal", "治療", "治癒", "回復" -> HEAL; case "obsession", "執念" -> OBSESSION; case "landing", "safe_landing", "安定着地" -> SAFE_LANDING; default -> null; };
    }
}
