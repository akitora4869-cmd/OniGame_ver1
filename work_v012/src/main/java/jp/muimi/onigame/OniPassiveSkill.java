package jp.muimi.onigame;

public enum OniPassiveSkill {
    CRAVING("渇望", "追跡が続くほど段階的に移動速度が上昇"),
    BLOOD_SCENT("血嗅", "負傷したぷれいやーを一定間隔で短時間発光"),
    GUARDIAN("守護", "心臓が損壊された際の通知間隔を短縮"),
    PREDATION("捕食", "ぷれいやーを瀕死・脱落させるとスタミナ回復"),
    INTERFERENCE("妨害", "心臓損壊の成功判定を狭め、通常成功時に進行を後退");

    public final String display;
    public final String description;

    OniPassiveSkill(String display,String description){this.display=display;this.description=description;}
}
