# OpenAI-Scala-Models

This is simply a collection of case classes that work against the OpenAI API: v 1.1.0

This is framework-agnostic, and you will have to supply your own encoders/decoders

This is an **unofficial library** and is **community-maintained**.

You can either just copy the source files to your repo or use as a library
[![](https://jitpack.io/v/fancellu/openai-scala-models.svg)](https://jitpack.io/#fancellu/openai-scala-models)

You can see an example usage of these models here
[OpenAICompletionApp](https://github.com/fancellu/zio-restful-webservice/blob/main/src/main/scala/com/felstar/restfulzio/openai/OpenAICompletionApp.scala)

## OpenAI docs

https://beta.openai.com/docs/api-reference

Root for all API calls ```https://api.openai.com/v1```

## Completions

https://beta.openai.com/docs/api-reference/completions

POST ```CreateCompletionRequest``` to /completions and receive ```CreateCompletionResponse```

## Models

https://beta.openai.com/docs/api-reference/models

GET /models to receive ```ListModelsResponse```

GET /models/{modelName} to receive ```Model```

## Edits

https://beta.openai.com/docs/api-reference/edits

POST ```CreateEditRequest``` and receive ```CreateEditResponse```

## Images

https://beta.openai.com/docs/api-reference/images

POST ```CreateImageRequest``` to /images/generations and receive ```ImagesResponse```

POST ```CreateImageEditRequest``` to /images/edits and receive ```ImagesResponse```

POST ```CreateImageVariationRequest``` to /images/variations and receive ```ImagesResponse```

## Moderations

https://beta.openai.com/docs/api-reference/moderations

POST ```CreateModerationRequest``` to /moderations and receive ```CreateModerationResponse```

