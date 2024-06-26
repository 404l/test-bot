### How to run application

JDK 17

#### 1. Clone repository
> `git clone git@github.com:404l/testBot.git`

#### 2. Setup VK API properties
> 1. Open `src/main/resources/vk.properties`
> 2. Specify params gotten from VK
>
> | Variable name       | Description                      |
> |---------------------|----------------------------------|
> | vk.api.access-token | VK API access token              |
> | vk.api.v            | VK API usage version             |
> | vk.api.secret       | Callback API secret key          |
> | vk.api.confirmation | Callback API confirmation string |

#### 3. Build
> `gradle build`

#### 4. Run
> `gradle bootRun`