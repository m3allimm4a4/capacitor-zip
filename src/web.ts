import { WebPlugin } from '@capacitor/core';

import type { CapacitorZipPlugin } from './definitions';

export class CapacitorZipWeb extends WebPlugin implements CapacitorZipPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
  async unzip(): Promise<{ result: boolean; message: string; uri: string }> {
    return Promise.reject('Works only on android');
  }
}
