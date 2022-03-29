# capacitor-zip

Zip and Unzip files on android. Based on Zip4j

## Install

```bash
npm install capacitor-zip
npx cap sync
```

## API

<docgen-index>

* [`unzip(...)`](#unzip)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### unzip(...)

```typescript
unzip(options: UnzipOptions) => Promise<UnzipResult>
```

| Param         | Type                                                  |
| ------------- | ----------------------------------------------------- |
| **`options`** | <code><a href="#unzipoptions">UnzipOptions</a></code> |

**Returns:** <code>Promise&lt;<a href="#unzipresult">UnzipResult</a>&gt;</code>

--------------------


### Interfaces


#### UnzipResult

| Prop          | Type                |
| ------------- | ------------------- |
| **`message`** | <code>string</code> |
| **`uri`**     | <code>string</code> |


#### UnzipOptions

| Prop              | Type                |
| ----------------- | ------------------- |
| **`source`**      | <code>string</code> |
| **`destination`** | <code>string</code> |
| **`password`**    | <code>string</code> |

</docgen-api>
