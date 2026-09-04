package jp.muimi.onigame;

public enum PassiveSkill {
    LIGHT_FOOTED("軽足", "走行スタミナ消費を15%軽減"),
    DEEP_BREATH("深呼吸", "スタミナ回復量を25%増加"),
    FOCUS("集中", "スキルチェック成功範囲と回復時の移動許容を拡大"),
    ATTACK_BOOST("神喰", "鬼への与ダメージを20%増加"),
    DURABILITY_BOOST("強靭", "最大体力を20から30へ増加"),
    EXORCISM("退魔", "鬼の心臓を損壊する作業速度を15%増加"),
    COWARDICE("臆病", "スニーク中の移動速度が通常歩行より少し遅い程度まで上昇"),
    BOND("絆", "治療完了時、周囲の生存している仲間も一緒に回復"),
    NINJA_BLOOD("忍びの血統", "移動速度が常に鬼より少し遅い程度まで上昇"),
    LEAP("跳躍", "空中でスペースをもう一度押すと視線方向へ大きく跳躍");

    public final String display;
    public final String description;

    PassiveSkill(String display,String description){this.display=display;this.description=description;}
}
