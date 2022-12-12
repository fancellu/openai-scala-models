package com.felstar.openai.moderation

/**
 * @param hate 
 * @param hatethreatening 
 * @param self_harm 
 * @param sexual 
 * @param sexualminors 
 * @param violence 
 * @param violencegraphic 
 */
case class CreateModerationResponseCategoryScores (
  hate: BigDecimal,
  `hate/threatening`: BigDecimal,
  self_harm: BigDecimal,
  sexual: BigDecimal,
  `sexual/minors`: BigDecimal,
  violence: BigDecimal,
  `violence/graphic`: BigDecimal
)

