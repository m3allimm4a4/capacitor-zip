# capacitor-zip

Zip and Unzip files on android. Based on Zip4j

## Install

```bash
npm install capacitor-zip
npx cap sync
```

## API

<docgen-index>

* [`echo(...)`](#echo)
* [`unzip(...)`](#unzip)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### echo(...)

```typescript
echo(options: { value: string; }) => Promise<{ value: string; }>
```

| Param         | Type                            |
| ------------- | ------------------------------- |
| **`options`** | <code>{ value: string; }</code> |

**Returns:** <code>Promise&lt;{ value: string; }&gt;</code>

--------------------


### unzip(...)

```typescript
unzip(options: { source: string; destination: string; }) => Promise<{ result: boolean; message: string; uri: string; }>
```

| Param         | Type                                                  |
| ------------- | ----------------------------------------------------- |
| **`options`** | <code>{ source: string; destination: string; }</code> |

**Returns:** <code>Promise&lt;{ result: boolean; message: string; uri: string; }&gt;</code>

--------------------

</docgen-api>
