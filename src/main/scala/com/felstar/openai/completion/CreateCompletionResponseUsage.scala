package com.felstar.openai.completion

/**
 * @param prompt_tokens
 * @param completion_tokens
 * @param total_tokens
 */
case class CreateCompletionResponseUsage(
                                          prompt_tokens: Int,
                                          completion_tokens: Int,
                                          total_tokens: Int
                                        )
