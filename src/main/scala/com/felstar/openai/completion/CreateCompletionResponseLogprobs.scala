package com.felstar.openai.completion

/**
 * @param tokens
 * @param token_logprobs
 * @param top_logprobs
 * @param text_offset
 */
case class CreateCompletionResponseLogprobs(
                                             tokens: Option[List[String]] = None,
                                             token_logprobs: Option[List[BigDecimal]] = None,
                                             top_logprobs: Option[List[Map[String, Double]]] = None,
                                             text_offset: Option[List[Int]] = None
                                           )
